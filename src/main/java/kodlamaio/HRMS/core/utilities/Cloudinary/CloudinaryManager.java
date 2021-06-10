package kodlamaio.HRMS.core.utilities.Cloudinary;

import java.util.Map;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.core.result.DataResult;

@Service
public class CloudinaryManager implements ImageService {

	private Cloudinary cloudinary;
	public CloudinaryManager() {

		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name","du9huaxi3",
				"api_key", "785136452583429",
				"api_secret","4TZE4Ouhxn42uGjBoKsNc8WapOI"));
	}
	
	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		// TODO Auto-generated method stub
		return null;
	}

}
