package tinhGiaiThua;

import java.util.List;

public interface PersonDao {
	void create(Person p);

	void update(Person p);

	void delete(Person p);

	Person get(int id);

	List<Person> search(String name);

}
