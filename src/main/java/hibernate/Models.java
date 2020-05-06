package hibernate;

public interface Models {

    void delete();

    void saveOrUpdate();

    void load();

    <E> E getId();

}
