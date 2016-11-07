package cis232.lab4;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DiceRollController {

    @FXML
    private ImageView imgDice1;
    Image imgBall1 = new Image("https://t2.rbxcdn.com/c8d0412c5032e04b0f7232a0800bdbf0");
    Image imgBall2= new Image("http://i.imgur.com/zfwH4DX.png");
    Image imgBall3= new Image("http://karlmac.com/wp-content/uploads/2011/08/3-star-dragonball.png");
    Image imgBall4= new Image("http://vignette3.wikia.nocookie.net/dragonball/images/b/b2/4_Star_Dragon_Ball_Edit.png/"
			+ "revision/latest?cb=20090527031247");
    Image imgBall5= new Image("http://karlmac.com/wp-content/uploads/2011/08/5-star-dragonball-300x300.png");
    Image imgBall6= new Image("https://s-media-cache-ak0.pinimg.com/originals/4a/c4/8f/4ac48f61c0a591e742c9e49"
			+ "9fc87c9ca.png");
    
    @FXML
    private ImageView imgDice2;
    Image imgBall11 = new Image("https://t2.rbxcdn.com/c8d0412c5032e04b0f7232a0800bdbf0");
    Image imgBall22= new Image("http://i.imgur.com/zfwH4DX.png");
    Image imgBall33= new Image("http://karlmac.com/wp-content/uploads/2011/08/3-star-dragonball.png");
    Image imgBall44= new Image("http://vignette3.wikia.nocookie.net/dragonball/images/b/b2/4_Star_Dragon_Ball_Edit.png/"
			+ "revision/latest?cb=20090527031247");
    Image imgBall55= new Image("http://karlmac.com/wp-content/uploads/2011/08/5-star-dragonball-300x300.png");
    Image imgBall66= new Image("https://s-media-cache-ak0.pinimg.com/originals/4a/c4/8f/4ac48f61c0a591e742c9e49"
			+ "9fc87c9ca.png");
    @FXML
    private Label lblTotal;

    @FXML
    void RollDiceListener(ActionEvent event) {
    	Random random = new Random();
    	int diceTotal;
    	int Dice1 =random.nextInt(7)+1;
    	int Dice2=random.nextInt(7)+1;
    	
    	diceTotal=Dice1+Dice2;
    	
    	lblTotal.setText(String.format("%d", diceTotal));
    	
    	if (Dice1==1){
    		
    		imgDice1.setImage(imgBall1);
    	}
    	else if (Dice1==2){
    		
    		imgDice1.setImage(imgBall2);
    	}
    	else if (Dice1==3){
    		
    		imgDice1.setImage(imgBall3);
    	}
    	else if (Dice1==4){
    		
    		imgDice1.setImage(imgBall4);
    	}
    	else if (Dice1==5){
    		
    		imgDice1.setImage(imgBall5);
    	}
    	else if (Dice1==6){
    		
    		imgDice1.setImage(imgBall6);
    	}
    	
    	
    	if (Dice2==1){
    		
    		imgDice2.setImage(imgBall1);
    	}
    	else if (Dice2==2){
    		
    		imgDice2.setImage(imgBall2);
    	}
    	else if (Dice2==3){
    		
    		imgDice2.setImage(imgBall3);
    	}
    	else if (Dice2==4){
    		
    		imgDice2.setImage(imgBall4);
    	}
    	else if (Dice2==5){
    		
    		imgDice2.setImage(imgBall5);
    	}
    	else if (Dice2==6){
    		
    		imgDice2.setImage(imgBall6);
    	}
    	
    	
    	
    }

}
