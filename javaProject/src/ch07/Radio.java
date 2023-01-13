package ch07;

public class Radio {
	//멤버 변수
	String name;
	boolean onOff; 
	float channel;
	int volume;
	
	
	//멤버 메소드
	public float getChannel() {
		return channel;
	}
	public void setChannel(float channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void print() {
		System.out.println("["+name+"]");
		if(onOff == true) {
			System.out.println("라디오가 켜져있습니다.");
		}else {
			System.out.println("라디오가 꺼져있습니다.");
		}
		System.out.println("현재 채널은 "+channel+"입니다.\n"+"볼륨은 "+volume+"입니다.\n");
		
	}
	
	
	
	
}
