package kodlamaio.HRMS.business.Concrete;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.business.Abstract.IResumeImageService;
import kodlamaio.HRMS.core.result.DataResult;
import kodlamaio.HRMS.core.result.Result;
import kodlamaio.HRMS.core.result.SuccessDataResult;
import kodlamaio.HRMS.core.result.SuccessResult;
import kodlamaio.HRMS.core.utilities.Cloudinary.ImageService;
import kodlamaio.HRMS.dataAccess.Abstract.IResumeImageDao;
import kodlamaio.HRMS.entities.Concrete.ResumeImage;

@Service
public class ResumeImageManager implements IResumeImageService{

	private IResumeImageDao resumeImageDao;
	private ImageService imageService;
	
	@Autowired
	public ResumeImageManager(IResumeImageDao resumeImageDao,ImageService imageService) {
		super();
		this.resumeImageDao = resumeImageDao;
		this.imageService = imageService;
	}
	
	@Override
	public Result add(ResumeImage resumeImage, MultipartFile imageFile) {
		@SuppressWarnings("unchecked")
		Map<String,String> uploadImage = this.imageService.uploadImageFile(imageFile).getData();
		resumeImage.setUrlAddress(uploadImage.get("url"));
		this.resumeImageDao.save(resumeImage);
		return new SuccessResult("Fotoğrafınız Sisteme Başarıyla Eklendi");
	}

	@Override
	public Result update(ResumeImage resumeImage) {
		this.resumeImageDao.save(resumeImage);
		return new SuccessResult("Fotoğrafınız Güncellenmiştir!");
	}

	@Override
	public Result delete(int id) {
		this.resumeImageDao.deleteById(id);
		return new SuccessResult("Fotoğrafınız Silinmiştir!");
	}

	@Override
	public DataResult<ResumeImage> getById(int id) {
		return new SuccessDataResult<ResumeImage>(this.resumeImageDao.getById(id));
	}

	@Override
	public DataResult<List<ResumeImage>> getAll() {
		return new SuccessDataResult<List<ResumeImage>>(this.resumeImageDao.findAll());
	}

	@Override
	public DataResult<ResumeImage> getByJobSeekerId(int id) {
		return new SuccessDataResult<ResumeImage>(this.resumeImageDao.getByCandidate_id(id));
	} 

}
