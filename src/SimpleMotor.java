import lejos.nxt.*;

/**
 * Classe SimpleMotor
 * @author Andrea Rauso
 * @author Peter Catania
 */
public class SimpleMotor {

	/**
	 * La porta a cui é collegato il motore
	 */
	private char port;
	
	/**
	 * il motore della classe NXTRegulatedMotor
	 */
	private NXTRegulatedMotor motor;
	
	/**
	 * La potenza del motore
	 */
	private byte power;
	
	/**
	 * Costruttore a 1 parametro
	 * @param port la porta dove é collegato il motore
	 */
	public SimpleMotor(char port) {
		if(port == 'A' || port == 'B' || port == 'C') {
			this.port = port;
			setMotor(this.port);
			this.power = 0;
		}
	}
	
	/**
	 * Metodo setMotor che setta il motore
	 * @param port la porta del motore
	 */
	public void setMotor(char port) {
		if(port == 'A') {
			this.motor = Motor.A;
		}else if(port == 'B') {
			this.motor = Motor.B;
		}else {
			this.motor = Motor.C;
		}
	}
	
	/**
	 * Metodo getMotor che ritorna il motore
	 * @return il motore
	 */
	public NXTRegulatedMotor getMotor() {
		return this.motor;
	}
	
	/**
	 * Metodo setPower che setta la potenza del motore
	 * @param power la potenza del motore
	 */
	public void setPower(byte power){
		if(power >= 0 && power <= 255){
			this.power = power;
		}
	}
	
	/**
	 * Metodo getPower che ritorna la potenza del motore
	 * @return la potenza del motore
	 */
	public byte getPower(){
		return this.power;
	}
	
	/**
	 * Metodo setDirection che setta la direzione (avanti o indietro) del motore
	 * @param direction la direzione del motore
	 */
	public void setDirection(boolean direction) {
		if(direction) {
			this.getMotor().forward();
		}else {
			this.getMotor().backward();
		}
	}
	
	/**
	 * Metodo startMotor che permette di far partire il motore
	 */
	public void startMotor() {
		this.getMotor().setSpeed(this.getPower());
	}
	
	/**
	 * Metodo stopMotor che permette di fermare il motore
	 */
	public void stopMotor() {
		this.getMotor().stop();
	}

}
