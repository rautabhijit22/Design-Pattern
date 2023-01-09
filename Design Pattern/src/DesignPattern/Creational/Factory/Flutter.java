package DesignPattern.Creational.Factory;

public class Flutter {

    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("this changes theme");
    }
    public void setRefreshRate(){
        System.out.println("this changes refresh Rate");
    }

    public UIFactory createUIFactory(){ //OCP vioaltion--> will use practical factory
        return UIFactoryFactory.createUIFactory(platform);
    }


}
