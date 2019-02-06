import lejos.nxt.Motor;
import lejos.nxt.NXTRegulatedMotor;

public class SimpleMotor {

	private char port;
	private NXTRegulatedMotor motor;
	private byte power;
	
	public SimpleMotor(char port) {
		if(port == 'A' || port == 'B' || port == 'C') {
			this.port = port;
			setMotor(this.port);
			this.power = 0;
		}
	}
	
	public void setMotor(char port) {
		if(port == 'A') {
			this.motor = Motor.A;
		}else if(port == 'B') {
			this.motor = Motor.B;
		}else {
			this.motor = Motor.C;
		}
	}
	public NXTRegulatedMotor getMotor() {
		return this.motor;
	}
	
	public void setPower(byte power){
		if(power >= 0 && power <= 255){
			this.power = power;
		}
	}
	
	public byte getPower(){
		return this.power;
	}
	
	public void setDirection(boolean direction) {
		if(direction) {
			this.getMotor().forward();
		}else {
			this.getMotor().backward();
		}
	}
	
	public void startMotor() {
		this.getMotor().setSpeed(this.getPower());
	}
	
	public void stopMotor() {
		this.getMotor().stop();
	}

}
