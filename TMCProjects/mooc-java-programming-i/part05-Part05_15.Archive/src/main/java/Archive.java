import java.util.ArrayList;

public class Archive {
    private String name;
    private String identifier;

    public Archive(String identifier, String name){
        this.name = name;
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // check if identifier has been added
    public boolean checkIdentifierExist(ArrayList<Archive> list)
    {
        for(Archive item:list)
        {
           if (this.identifier.equals(item.getIdentifier()))
           {
               return true;
           }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
