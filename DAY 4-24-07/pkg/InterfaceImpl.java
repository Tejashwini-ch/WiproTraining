package pkg;

public class InterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable audioplayer=new AudioPlayer();
		Recordable audiorecord=new AudioPlayer();
		audioplayer.play();
		audiorecord.record();
		System.out.println();
		
		Playable videoplayer=new VideoPlayer();
		Streamable videostream=new VideoPlayer();
		videoplayer.play();
		videostream.stream();
		System.out.println();
		
		Recordable camerarecord = new CameraPlayer();
        Streamable camerastream = new CameraPlayer();
        camerarecord.record();
        camerastream.stream();

	}

}
