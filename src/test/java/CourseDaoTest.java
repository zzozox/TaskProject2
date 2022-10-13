import Dao.Impl.CourseDao;
import Entity.Course;
import org.junit.Test;

public class CourseDaoTest {
    CourseDao cDao =new CourseDao();

    @Test
    public void createCou(){
        Course c1=new Course();
        c1.setCourseId(1000002l);
        c1.setCourseName("编程能力提升");
        c1.setCredit(2.0);

        cDao.save(c1);
    }

    @Test
    public void test(){
        System.out.println("zzx写了点东西");
        System.out.println("别管zzx了，她写不出什么好东西，就这样吧");
        System.out.println("刚才好像push失败了，再来一次");
    }

}
