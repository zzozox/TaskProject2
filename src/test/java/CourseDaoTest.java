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

    }

}
