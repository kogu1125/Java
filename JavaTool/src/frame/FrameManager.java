package frame;

public class FrameManager {
    
    public FrameManager() {
    }
    
    public void reloadPanel(String reloadFrame,FileToolFrame nowFrame) {
    	nowFrame.f.dispose();
    	switch(reloadFrame) {
    	case "FrameTop":
    		new FileToolFrameTop();
    		break;
    	case "Frame01":
    		new FileToolFrame01();
    		break;
    	case "Frame02":
    		new FileToolFrame02();
    		break;
    	case "Frame03":
    		new FileToolFrame03();
    		break;
    	case "Frame04":
    		new FileToolFrame04();
    		break;
    	case "Frame05":
    		new FileToolFrame05();
    		break;
    	case "Frame06":
    		new FileToolFrame06();
    		break;
    	case "Frame07":
    		new FileToolFrame07();
    		break;
    	case "Frame08":
    		new FileToolFrame08();
    		break;
    	case "Frame09":
    		new FileToolFrame09();
    		break;
    	case "Frame10":
    		new FileToolFrame10();
    		break;
    	case "Frame11":
    		new FileToolFrame11();
    		break;
    	case "Frame12":
    		new FileToolFrame12();
    		break;
    	case "Frame13":
    		new FileToolFrame13();
    		break;
    	}
    }
}
