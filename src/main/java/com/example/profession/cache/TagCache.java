package com.example.profession.cache;

import com.example.profession.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : zwz
 * @date : 2020/3/7 0007
 */
public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();

        TagDTO frontend  = new TagDTO();
        frontend.setCategoryName("前端开发");
        frontend.setTags(Arrays.asList("前端开发","web前端","JavaScript","Flash开发","HTML5"));
        tagDTOS.add(frontend);

        TagDTO backend = new TagDTO();
        backend.setCategoryName("后端开发");
        backend.setTags(Arrays.asList("Java", "C++ ","C#","C","PHP", "数据挖掘", ".NET", "Hadoop", "Python", "Delphi", "Node.js", "Perl", "Ruby", "搜索算法", "Golang", "推荐算法", " Erlang", " 算法工程师", " 语音/视频/图形开发", "数据采集"));
        tagDTOS.add(backend);

        TagDTO mobile = new TagDTO();
        mobile.setCategoryName("移动开发");
        mobile.setTags(Arrays.asList("UE4","移动开发","HTML5","Android","iOS","WP","移动web前端","Flash开发","JavaScript","U3D","COCOS2DX"));
        tagDTOS.add(mobile);

        TagDTO test  = new TagDTO();
        test.setCategoryName("测试");
        test.setTags(Arrays.asList("测试工程师","自动化测试","功能测试","性能测试","测试开发","移动端测试","游戏测试","硬件测试","软件测试"));
        tagDTOS.add(test);

        TagDTO operation = new TagDTO();
        operation.setCategoryName("运维");
        operation.setTags(Arrays.asList("运维工程师","运维开发工程师","网络工程师","系统工程师","IT技术支持","系统管理员","网络安全","系统安全","DBA"));
        tagDTOS.add(operation);

        TagDTO data = new TagDTO();
        data.setCategoryName("运维");
        data.setTags(Arrays.asList("算法研究员","数据","ETL工程师","数据仓库","数据开发","数据挖掘","数据分析师","数据架构师"));
        tagDTOS.add(data);

        TagDTO program = new TagDTO();
        program.setCategoryName("开发语言");
        program.setTags(Arrays.asList("javascript", "php", "css", "html", "html5", "java", "node.js", "python", "c++", "c", "golang", "objective-c", "typescript", "shell", "swift", "c#", "sass", "ruby", "bash", "less", "asp.net", "lua", "scala", "coffeescript", "actionscript", "rust", "erlang", "perl"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("平台框架");
        framework.setTags(Arrays.asList("laravel", "spring", "express", "django", "flask", "yii", "ruby-on-rails", "tornado", "koa", "struts"));
        tagDTOS.add(framework);


        TagDTO server = new TagDTO();
        server.setCategoryName("服务器");
        server.setTags(Arrays.asList("linux", "nginx", "docker", "apache", "ubuntu", "centos", "缓存 tomcat", "负载均衡", "unix", "hadoop", "windows-server"));
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setCategoryName("数据库");
        db.setTags(Arrays.asList("mysql", "redis", "mongodb", "sql", "oracle", "nosql memcached", "sqlserver", "postgresql", "sqlite"));
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("开发工具");
        tool.setTags(Arrays.asList("git", "github", "visual-studio-code", "vim", "sublime-text", "xcode intellij-idea", "eclipse", "maven", "ide", "svn", "visual-studio", "atom emacs", "textmate", "hg"));
        tagDTOS.add(tool);

        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));

        return invalid;
    }
}
