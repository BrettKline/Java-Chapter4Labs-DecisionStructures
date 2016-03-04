
public class Cookout {
	private final int HOTDOG_PACK = 10;
	private final int BUN_PACK = 8;
	private int hotdogPacksRequired;
	private int bunPacksRequired;
	private int leftoverHotdogs;
	private int leftoverBuns;
	
	public Cookout(int numPeople, int numHotdogs) {
		int neededServings = numPeople * numHotdogs;
		hotdogPacksRequired = neededServings / HOTDOG_PACK;
		bunPacksRequired = neededServings / BUN_PACK;
		leftoverHotdogs = neededServings % HOTDOG_PACK;
		leftoverBuns = neededServings % BUN_PACK;
	}

	public int getHotdogPacksRequired() {
		return hotdogPacksRequired;
	}

	public int getBunPacksRequired() {
		return bunPacksRequired;
	}

	public int getLeftoverHotdogs() {
		return leftoverHotdogs;
	}

	public int getLeftoverBuns() {
		return leftoverBuns;
	}
	
	
}
