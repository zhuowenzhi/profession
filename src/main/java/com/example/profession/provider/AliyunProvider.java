package com.example.profession.provider;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

/**
 * @author : zwz
 * @date : 2020/3/9 0009
 */
@Service
public class AliyunProvider {
    // Endpoint以杭州为例，其它Region请按实际情况填写。
    @Value("aliyunc.ufile.accessKeyId")
    String accessKeyId;

    @Value("aliyunc.ufile.accessKeySecret")
    String accessKeySecret;

    @Value("aliyunc.ufile.bucketName")
    String bucketName;

    @Value("aliyunc.ufile.endpoint")
    String endpoint;

    // 创建OSSClient实例。
    OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

    // 创建PutObjectRequest对象。
    PutObjectRequest putObjectRequest = new PutObjectRequest("<yourBucketName>", "<yourObjectName>", new File("<yourLocalFile>"));

    public void upload(InputStream inputStream, String contentType, String originalFilename) {

    }

    // 如果需要上传时设置存储类型与访问权限，请参考以下示例代码。
    // ObjectMetadata metadata = new ObjectMetadata();
    // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
    // metadata.setObjectAcl(CannedAccessControlList.Private);
    // putObjectRequest.setMetadata(metadata);

    // 上传文件。
//    ossClient.putObject(putObjectRequest);

    // 关闭OSSClient。
//    ossClient.shutdown();

}
