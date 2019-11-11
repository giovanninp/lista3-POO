package repo;

public abstract interface RepoInterface {
	public boolean add(Object element);
	public boolean rem(int index);
	public Object get(int index);
	public Object [] list();
	public Object getByid(String id);
//	public String [] listString;
}
