package snake.and.ladders.mini.project;
//<applet code="snakeandladders.class" width="710" height="660">
//</applet>
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
 
 public class snakeandladders	 extends Applet  implements Runnable,ActionListener{
        Thread t;
        int ppos=0,cpos=0,curpos=0,nextpos=0,turn=0,die,flag=0,f1=0;
        Random r= new Random();
        @Override
        public void init()
        {
        
            resize(710,660);
            this.setLayout(null);
            Button b1=new Button("Next turn");
            b1.setBounds(620,300, 50, 40);
            b1.addActionListener( this); 
            add(b1);        
            t = new Thread(this, "MyThread");
            t.start();
                
        }
        public void actionPerformed(ActionEvent e){  
            flag=1  ;
}  
        @Override
        public void run()
        {
            while (true) { 
               
                if(flag==1){
                    if(turn==0)
                        flag=1;
                    else
                        flag=0;
                update();
                repaint(); 
          
                try { 
                    Thread.sleep(1000); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                } }
            } 
        }
        public void update()
        {   
            if(turn==0)
            {
                curpos=ppos;
                die=(r.nextInt(10000)%6)+1;
                if(ppos+die<101)
                {ppos+=die;}
                else
                    f1=3;
              
                //ladders
	if(ppos==1)
	      {
                  f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	       ppos=38;
	       }
	if(ppos==4)
	     {
		  f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=14;
		}
	if(ppos==8)
	      {
	        f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=30;
	      }
	if(ppos==21)
	     {
	      f1=1;
     
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=42;

	      }
	if(ppos==28)
	      {
	       f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
      
	      ppos=76;
	      }
	if(ppos==50)
	      {
	        f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=67;
	      }
	if(ppos==71)
	      {
	        f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=92;
	      }
	if(ppos==80)
	      {
	        f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=99;
	     }

	//snakes
	if(ppos==97)
	      {
	        f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=78;
	      }
	if(ppos==95)
	      {  f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=56;
	      }
	if(ppos==88)
	      {  f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=24;
	      }
	if(ppos==32)
	      {
	        f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=10;
	      }
	if(ppos==62)
	      {  f1=2;
   
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=18;
	      }
	if(ppos==48)
	      {
	        f1=2;
                  

                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=26;
	      }
	if(ppos==36)
	      {
	        f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      ppos=6;
	      }

            }
         
        if(turn==1)
            {   curpos=cpos;
                die=(r.nextInt(10000)%6)+1;
                if(cpos+die<101)
                {cpos+=die;}
                else
                    f1=3;
        
              
                //ladders
	if(cpos==1)
	      {
	  f1=1;
                  
	        repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	       cpos=38;
	       }
	if(cpos==4)
	     {
		  f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=14;
		}
	if(cpos==8)
	      {  f1=1;
                  
	         repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      
	      cpos=30;
	      }
	if(cpos==21)
	     {
	      f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=42;

	      }
	if(cpos==28)
	      {
	       f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
      
	      cpos=76;
	      }
	if(cpos==50)
	      {
	        f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=67;
	      }
	if(cpos==71)
	      {
	        f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=92;
	      }
	if(cpos==80)
	      {
	        f1=1;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=99;
	     }

	//snakes
	if(cpos==97)
	      {
	        f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=78;
	      }
	if(cpos==95)
	      {  f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=56;
	      }
	if(cpos==88)
	      {  f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=24;
	      }
	if(cpos==32)
	      {
	        f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=10;
	      }
	if(cpos==62)
	      {  f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=18;
	      }
	if(cpos==48)
	      {
	        f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=26;
	      }
	if(cpos==36)
	      {
	        f1=2;
                  
	
                repaint(); 
          
                try { 
                    Thread.sleep(1500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
	      cpos=6;
	      }

            }
        turn= (turn+1)%2;
        }
        @Override
    public void paint(Graphics g)
    {
	int x=600/10,y=600/10;
        int k=1,f=0;
        if(cpos==100)
        {
        g.drawString("COMPUTER WINS!!", 300, 300);
        try { 
                    Thread.sleep(5000); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
        System.exit(0);
        }
        if(ppos==100)
        {
        g.drawString("PLAYER WINS!!",300,300);
        try { 
                    Thread.sleep(10000); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
        System.exit(0);
        }    
        //board
        for(int i=0;i<=10;i++)
        {
            g.drawLine(x*i,0,x*i,600);
            g.drawLine(0,y*i,600,y*i);
        }
        for(int i=9;i>=0;i--)
        {
            for(int j=0;j<10;j++)
            {
		g.drawString(String.format("%d",k), x*j+5,y*i+15);
		if(f==0)
			k++;
		else
			k--;
            }
            if(i%2!=0)
            {
		 f=1;
		 k+=9 ;
             }
            if(i%2==0)
            {
		 f=0;
		 k+=11;
            }
        }
        //snakes and ladders
        //ladders
        g.setColor(Color.orange);
        for(int j=0;j<=10;j+=10)
        {
            g.drawLine(0+20+j,y*9+10,x*2+20+j,y*6+30);
            g.drawLine(x*3+20,y*9+10+j,x*6+20,y*8+20+j);
            g.drawLine(x*7+20+j,y*9+10,x*9+20+j,y*7+30);
            g.drawLine(20+j,y*7+10,x+20+j,y*5+30);
            g.drawLine(x*7+20+j,y*7+10,x*4+20+j,y*2+30);
            g.drawLine(x*9+20,y*5+15+j,x*6+20,y*3+20+j);
            g.drawLine(x*9+20+j,y*2+10,x*8+20+j,30);
            g.drawLine(20+j,y*2+10,x+20+j,30);
        }
        //snakes
        g.setColor(Color.GREEN);
        for(int u=1;u<8;u++)
        {
            for(int i=-3;i<4;i++)
            {
                g.drawLine(x*5+20,y*9+10,x*4+20+i,y*6+30);
                g.drawOval(x*4+20-u,y*6+30-u,u*2,u*2);

                g.drawLine(x*9+20,y*9+10,x*8+20+i,y*6+30);
                g.drawOval(x*8+20-u,y*6+30-u,u*2,u*2);

                g.drawLine(x*5+20,y*7+10,x*7+20+i,y*5+30);
                g.drawOval(x*7+20-u,y*5+30-u,u*2,u*2);

                g.drawLine(x*2+20,y*8+10,x+20+i,y*3+30);
                g.drawOval(x+20-u,y*3+30-u,u*2,u*2);

                g.drawLine(x*3+20,y*7+10,x*7+20+i,y+30);
                g.drawOval(x*7+20-u,y+30-u,u*2,u*2);

                g.drawLine(x*4+20,y*4+10,x*5+20+i,30);
                g.drawOval(x*5+20-u,30-u,u*2,u*2);

                g.drawLine(x*2+20,y*2+10,x*3+20+i,30);
                g.drawOval(x*3+20-u,30-u,u*2,u*2);
            }
        }
        
 int l=1;
 for(int i=9;i>=0;i--)
 {
	if(i%2!=0)
	{
		for(int j=0;j<10;j++)
		{
			
				if(cpos==l)
				{
					
					g.setColor(Color.blue);
					for(int m=0;m<=15;m++)
					g.drawOval(j*x+25,i*y+20,m,m);

				}
                                if(ppos==l)
				{
					
					g.setColor(Color.red);
					for(int m=0;m<=15;m++)
					g.drawOval(j*x+25+3*3,i*y+20+3*3,m,m);

				}


			
			l++;
		}
	}

	else
	{
		for(int j=9;j>=0;j--)
		{
			
				if(cpos==l)
				{
					
					g.setColor(Color.blue);
					for(int m=0;m<=15;m++)
					g.drawOval(j*x+25,i*y+20,m,m);

				}
                                if(ppos==l)
				{
					
					g.setColor(Color.red);
					for(int m=0;m<=15;m++)
					g.drawOval(j*x+25+3*3,i*y+20+3*3,m,m);

				}
			l++;
		}
       }
 }
 g.setColor(Color.BLACK);
 if(f1==1)
 {
 g.drawString("LADDER!!",10,610);
 f1=0;}
 else if(f1==2)
 {
 g.drawString("SNAKE!!",10,610);
 f1=0;}
 else if(f1==3)
 {
 g.drawString("Roll exceeds board", 10, 610);
 f1=0;
 try { 
                    Thread.sleep(500); 
                } 
                catch (InterruptedException ie) { 
                System.out.println(ie); 
                }
 }
 else
 {
 if(turn==0)
 {
 g.drawString("Your Turn",610,290);
 }
 else
 g.drawString("Computer's Turn",610,290);    
 if(turn==1)
 {g.drawString(String.format("player rolled %d and moved from %d to %d ",die,curpos,ppos), 10, 610);
 nextpos=1;}
 else if(turn!=1 && nextpos!=0)
 g.drawString(String.format("Computer rolled %d and moved from %d to %d ",die,curpos,cpos),10, 610);
         }   
    }
}
