public interface Mediator {
	public void receiveSMS(String msg, int from, int to);
	public void deliverSMS(int to);
	public int addUser(User user);
}