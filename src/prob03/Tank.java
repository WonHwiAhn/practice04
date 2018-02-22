package prob03;

public class Tank extends Unit{
	// 현재 위치
	private int x;
	private int y; 
	
	void changeMode() {
		System.out.println("공격모드로 전환!");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("탱크 " + x + ", " + y + "로 이동중입니다.");
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("탱크가 " + x + ", " + y + "의 위치에서 정지하였습니다.");
	}
}
