package annotations;

@NameofAnnotation // syntax // above the thing that your'e applying it to
//no semi-colons
@Entity
public class Product {
    //define property name
    @Persistent
    protected String name = null;

    public String getName(){
        return name;
    }

    public void setName(@Optional name){
        this.name = name;
    }
}
