package prob03;

public class DropShip extends Unit{
	// 현재 위치
	private int x;
	private int y; 
	
	void load() {
		System.out.println("선택 대상을 태웠습니다.");
	}
	
	void unload() {
		System.out.println("선택 대상을 내렸습니다.");
	}
	
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽 " + x + ", " + y + "로 이동중입니다.");
	}
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽이 " + x + ", " + y + "의 위치에서 정지하였습니다.");
	}
}