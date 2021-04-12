package ro.ase.cts.decorator;

public abstract class DecoratorContactLess implements ICard{
	private ICard card;
	
	public DecoratorContactLess(ICard card) {
		super();
		this.card = card;
	}

	public ICard getCard() {
		return card;
	}

	@Override
	public void platesteOnline() {
		card.platesteOnline();
	}

	@Override
	public void platesteFizic() {
		card.platesteFizic();
	}
	
	@Override
	public String getDetinatorCard() {
		return card.getDetinatorCard();
	}
	
	public abstract void platesteContactLess();
	
}
