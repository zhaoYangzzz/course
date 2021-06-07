import com.course.server.dto.ChapterDto;
import com.course.server.service.ChapterService;

import javax.annotation.Resource;
import java.util.List;

public class Test {

    public static void main(String[] args) {

       ChapterService chapterService = new ChapterService();
       List<ChapterDto> chapterDtoList = chapterService.list();
        for (ChapterDto sss: chapterDtoList
             ) {
            System.out.println(sss.getId()+"\t"+sss.getName());
        }
    }
}
