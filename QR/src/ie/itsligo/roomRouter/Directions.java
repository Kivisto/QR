package ie.itsligo.roomRouter;
import java.io.*;
import java.util.concurrent.TimeUnit;
import sun.audio.*;

public class Directions {
	private final int ROOM_LENGTH = 5; // size of the room string
	private char building ;
	private char floor;
	private String locaationOnFloor = null;

	public Directions() {

	}

	
	public char getBuilding() {
		return building;
	}


	public void setBuilding(char building) {
		this.building = building;
	}


	public char getFloor() {
		return floor;
	}


	public void setFloor(char floor) {
		this.floor = floor;
	}


	public String getLocaationOnFloor() {
		return locaationOnFloor;
	}

	public void setLocaationOnFloor(String locaationOnFloor) {
		this.locaationOnFloor = locaationOnFloor;
	}

	/*
	 * This method takes in a room eg E2004 and splits up into the correct block
	 * (Engineering, Science, Business, etc) The correct floor The correct room
	 * number
	 */
	public boolean validate(String room) {
		if (room.length() != ROOM_LENGTH) {
			return false;
		}
		if (Character.isLetter(room.charAt(0)) == false) {
			return false; // room must start with a letter
		}
		for (int i = 1; i < ROOM_LENGTH; i++) {
			if (Character.isDigit(room.charAt(i)) == false) {
				return false; // room must start with a letter
			}
		}
		
		// all ok - store the info
		building = room.charAt(0);
		floor = room.charAt(1);
		locaationOnFloor = room.substring(2);
		System.out.println(room.substring(2));
		
		return true;
	}
	
	/*
	 * Get directions to building
	 */
	public String toBuilding() {
		String directions = null;
	    InputStream in = null;
	    AudioStream audioStream = null;
	    
		switch (this.building) {
		case 'A':
		    // open the sound file as a Java input stream
		    String buildingA = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/buildingA.wav";
			try {
				in = new FileInputStream(buildingA);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "From reception, walk straight ahead and then turn to your right";			
			//Delay
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;			
			
		case 'B':
		    // open the sound file as a Java input stream
		    String buildingB = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/buildingB.wav";
			try {
				in = new FileInputStream(buildingB);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "From reception, go up main stairs on your left and turn right.  Walk for 40m past Library until you read the Booknest";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(9);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case 'C':
		    // open the sound file as a Java input stream
		    String buildingC = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/buildingC.wav";
			try {
				in = new FileInputStream(buildingC);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "From reception, go up main stairs on your left and turn right.  Walk for 40m past Library until you read the Booknest, then turn left and continute through long corridor";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(13);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			break;
			
		case 'D':
		    // open the sound file as a Java input stream
		    String buildingD = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/buildingD.wav";
			try {
				in = new FileInputStream(buildingD);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "From reception, go up main stairs on your left and turn right.  Walk for 40m past Library until you read the Booknest, then turn left and conrinute through long corridor";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(13);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case 'E':
		    // open the sound file as a Java input stream
		    String buildingE = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/buildingE.wav";
			try {
				in = new FileInputStream(buildingE);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "From reception, move the the centre of reception and turn left into the engineering building";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(6);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case 'F':
		    // open the sound file as a Java input stream
		    String buildingF = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/buildingF.wav";
			try {
				in = new FileInputStream(buildingF);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "From reception, walk outside and turn to your right.  Walk past the engineering building and the F block is straigt in front";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(8);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		default:
		    // open the sound file as a Java input stream
		    String buildingError = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/buildingError.wav";
			try {
				in = new FileInputStream(buildingError);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "Sorry, that building in not recognised";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(6);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		}
		return(directions);
	}
	
	/*
	 * Get directions to floor
	 */
	public String toFloor() {
		String directions = null;
	    InputStream in = null;
	    AudioStream audioStream = null;
	    
		switch (this.floor) {
		case '0':
		    // open the sound file as a Java input stream
		    String floor0 = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/floor0.wav";
			try {
				in = new FileInputStream(floor0);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "Stay on this floor";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case '1':
		    String floor1 = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/floor1.wav";
			try {
				in = new FileInputStream(floor1);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "Ascend the stairs or take the lift to the first floor";			
			//Delay
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case '2':
		    String floor2 = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/floor2.wav";
			try {
				in = new FileInputStream(floor2);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "Ascend two flight of stairs or take the lift to the second floor";			
			//Delay
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		default:
			directions = "Sorry, floor " + this.floor + " is not recognised";
			break;
			
		}
		return(directions);
	}

	/*
	 * Get directions to floor
	 */
	public String toLocation() {
		String directions = null;
	    InputStream in = null;
	    AudioStream audioStream = null;
		
		switch (this.locaationOnFloor) {
		case "006":
		    String room006 = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/room006.wav";
			try {
				in = new FileInputStream(room006);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "This is a room to the right on this level";
			//Delay
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case "007":
		    String room007 = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/room007.wav";
			try {
				in = new FileInputStream(room007);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "This is a room to the right on this level";			
			//Delay
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case "003":
		    String room003 = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/room003.wav";
			try {
				in = new FileInputStream(room003);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "This is the last room to the right on this level";			
			//Delay
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		case "004":
		    String room004 = "F:/SoftwareEngineering/FinalLab/QR/directionsAudio/room004.wav";
			try {
				in = new FileInputStream(room004);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // create an audiostream from the inputstream
			try {
				audioStream = new AudioStream(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
			directions = "This is the second last room to the right on this level";			
			//Delay
			try {
				TimeUnit.SECONDS.sleep(4);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
			
		default:
			directions = "Sorry, that room in not recognised";
			break;
			
		}
		return(directions);
	}

}
