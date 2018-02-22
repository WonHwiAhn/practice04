package prob03;

public class Marine extends Unit{
	// 현재 위치
	private int x;
	private int y; 
	
	void stimPack() { 
		System.out.println("스팀팩을 사용했습니다.");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린 " + x + ", " + y + "로 이동중입니다.");
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("마린이 " + x + ", " + y + "의 위치에서 정지하였습니다.");
	}
}
