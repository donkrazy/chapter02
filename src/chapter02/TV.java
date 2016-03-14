package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV( int channel, int volume, boolean power ){
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power( boolean power ) {
		this.power = power;
	}

	public void volume( int volume ) {
		if( volume < 0 ) {
			this.volume = 0;
			return;
		}
		
		if( volume > 255 ) {
			this.volume = 255;
			return;
		}
		
		this.volume = volume;
	}

	public void volume( boolean up ) {
		volume( volume + ( up ? 1 : -1 ) );
	}

	public void channel( int channel ) {
		if( channel < 0 ) {
			this.channel = 0;
			return;
		}
		
		if( channel > 255 ) {
			this.channel = 255;
			return;
		}
		
		this.channel = channel;
	}

	public void channel( boolean up ) {
		channel( channel + ( up ? 1 : -1 ) );
	}
	
	public void status() {
		System.out.println( 
			"channel=" + channel + 
			", volume=" + volume + 
			", power=" + power );
	}
	
	
}
