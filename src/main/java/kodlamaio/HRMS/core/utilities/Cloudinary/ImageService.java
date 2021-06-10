package kodlamaio.HRMS.core.utilities.Cloudinary;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HRMS.core.result.DataResult;

public interface ImageService {

	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
