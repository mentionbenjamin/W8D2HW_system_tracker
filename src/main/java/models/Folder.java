package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    private int id;
    private String name;
    private List<File> file;
    private Owner owner;

    public Folder() {
    }

    public Folder(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
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

    // connect to file - one to many
    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    public List<File> getFile(){
        return file;
    }

    public void setFile(List<File> file){
        this.file = file;
    }

    // connect to owner - many to one
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    public Owner getOwner(){
        return owner;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }


}