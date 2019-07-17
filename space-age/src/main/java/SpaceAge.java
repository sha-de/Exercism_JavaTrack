class SpaceAge {

	private final long earthY=31557600L;
	double seconds;
	
    SpaceAge(double seconds) {
        this.seconds=seconds;
    }

    double getSeconds() {
		return seconds;
	}

    double onEarth() {
		return seconds/earthY;
    }

    double onMercury() {
		double mercuryY=earthY*0.2408467;
		return seconds/mercuryY;
    }

    double onVenus() {
       double venusY=earthY*0.61519726 ;
		return seconds/venusY;
    }

    double onMars() {
		double marsY=earthY*1.8808158 ;
		return seconds/marsY;
    }

    double onJupiter() {
        double jupiterY=earthY*11.862615 ;
		return seconds/jupiterY;
    }

    double onSaturn() {
        double saturnY=earthY*29.447498 ;
		return seconds/saturnY;
    }

    double onUranus() {
        double uranusY=earthY*84.016846 ;
		return seconds/uranusY;
    }

    double onNeptune() {
        double neptuneY=earthY*164.79132 ;
		return seconds/neptuneY;
    }

}
