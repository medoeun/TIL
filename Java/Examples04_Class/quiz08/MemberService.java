package q01.quiz04.quiz08;

// Quiz08_15
public class MemberService {
	public boolean login(String id, String password) {

		if (id == "hong" && password == "12345") {
			return true;
		}
		return false;
	}

	public void logout(String id) {

		System.out.println("로그아웃 되었습니다.");
	}
}
