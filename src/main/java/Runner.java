import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("Welcome Folder");
        DBHelper.save(folder1);


        File file1 = new File("Welcome File", 200, ".txt", folder1);
        DBHelper.save(file1);

        File file2 = new File("Second File", 100, ".java", folder1);
        DBHelper.save(file2);

        File file3 = new File("Third File", 50, ".ruby", folder1);
        DBHelper.save(file3);




        List<File> files = DBHelper.getAll(Folder.class);

        File foundFile = DBHelper.find(File.class, file2.getId());

//        List<File> piratesOnPearl = DBShip.getCrewForShip(pearl);

    }
}
