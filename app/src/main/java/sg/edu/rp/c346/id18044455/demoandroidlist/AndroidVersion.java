package sg.edu.rp.c346.id18044455.demoandroidlist;

public class AndroidVersion {


    private String name;
    private String versions;

    public AndroidVersion(String name, String versions) {
        this.name = name;
        this.versions = versions;
    }

    public String getName() {
        return name;
    }

    public String getVersions() {
        return versions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    @Override
    public String toString() {
        return name + ": " +
                versions ;
    }
}//end of class
