import eu.rageproject.asset.manager.AssetManager;
import eu.rageproject.asset.manager.IBridge;
import eu.rageproject.asset.manager.Severity;

public class HelloAssetManager {

    private static IBridge bridge = new Bridge();

    public static void main(String[] args){

        System.out.println("AssetManager for Java");

        AssetManager.getInstance().setBridge(bridge);

        AssetManager.getInstance().Log(Severity.Information, "%s", "Hello from AssetManager");
    }
}
