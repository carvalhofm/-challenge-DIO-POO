import br.dev.carvalhofm.challenge.dio.domain.Bootcamp;
import br.dev.carvalhofm.challenge.dio.domain.Course;
import br.dev.carvalhofm.challenge.dio.domain.Dev;
import br.dev.carvalhofm.challenge.dio.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java Course");
        course1.setDescrible("Describe: Java course");
        course1.setLearnload(8);

        Course course2 = new Course();
        course2.setTitle("Js Course");
        course2.setDescrible("Describe: JavaScript course");
        course2.setLearnload(40);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Java mentoring");
        mentoring1.setDescrible("Describe: Javas mentoring");
        mentoring1.setDate(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Bootcamp Java Developer");
        bootcamp1.setDescrible("Describe: Bootcamp Java Developer");
        bootcamp1.getContents().add(course1);
        bootcamp1.getContents().add(course2);
        bootcamp1.getContents().add(mentoring1);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setName("Bootcamp micro Java Developer");
        bootcamp2.setDescrible("Describe: Bootcamp micro Java Developer");
        bootcamp2.getContents().add(course1);
        bootcamp2.getContents().add(mentoring1);

        Dev devCarvalho = new Dev();
        devCarvalho.setName("Fabio Carvalho");
        devCarvalho.bootcampRegister(bootcamp1);
        devCarvalho.progress();

        Dev devZe = new Dev ();
        devZe.setName("Jo Zé");
        devZe.bootcampRegister(bootcamp2);
        devZe.progress();

        System.out.println("Content registered for Carvalho: "+ devCarvalho.getContentsRegisted());
        System.out.println("XP Carvalho: " +devCarvalho.xpCalculate());

        System.out.println("Content registered for Zé: "+ devZe.getContentsRegisted());
        System.out.println("XP Zé: " +devZe.xpCalculate());



    }
}
