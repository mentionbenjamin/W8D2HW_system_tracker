package models;

import javax.persistence.*;

@Entity
@Table(name="files")
public class File {

    private int id;
    private String name;
    private int size;
    private String extension;
    private Folder folder;

    public File() {
    }

    public File(String name, int size, String extension, Folder folder) {
        this.name = name;
        this.size = size;
        this.extension = extension;
        this.folder = folder;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Column(name = "extension")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    public Folder getFolder(){
        return folder;
    }

    public void setFolder(Folder folder){
        this.folder = folder;
    }
}