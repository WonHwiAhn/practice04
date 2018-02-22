package prob05;

public class MyBase extends Base {
	public void service(String state) {
		if(state.equals("밤") || state.equals("낮")) {
			super.service(state);
		}else if(state.equals("오후")) {
			System.out.println("오후도 낮과 마찬가지로 일해야합니다.");
		}
	}
}