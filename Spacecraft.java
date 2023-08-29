public class Spacecraft {
    int x,y,z;
    char direction;

    Spacecraft(int initialX,int initialY,int initialZ,char initialdirection){
        x=initialX;
        y=initialY;
        z=initialZ;
        direction=initialdirection;
    }
    public void executeCommands(char[] commands){
        for(int i=0;i<commands.length;i++){
            executeCommand(commands[i]);
        }
    }
    private void executeCommand(char command){
        switch(command){
            case 'f':
                moveForward();
                break;
            case 'b':
                moveBackward();
                break;
            case 'r':
                turnRight();
                break;
            case 'l':
                turnLeft();
                break;
            case 'u':
                turnUp();
                break;
            case 'd':
                turndown();
                break;
        }
    }

    // Implement Forward Movement
    public void moveForward(){
        if(direction == 'N'){
            y++;
        }else if(direction == 'S'){
            y--;
        }else if(direction == 'E'){
            x++;
        }else if(direction == 'W'){
            x--;
        }

    }
    
    // Implement Backward movement
    public void moveBackward(){
        if(direction == 'N'){
            y--;
        }else if(direction == 'S'){
            y++;
        }else if(direction == 'E'){
            x--;
        }else if(direction == 'W'){
            x++;
        }
    }
    public static void main(String[] args) {
        int initialX=0,initialY=0,initialZ=0;
        char initialdirection='N';
        char[]commands={'f','r','u','b','l'};

        Spacecraft chandrayan3=new Spacecraft(initialX,initialY,initialZ,initialdirection);

    }
    
}