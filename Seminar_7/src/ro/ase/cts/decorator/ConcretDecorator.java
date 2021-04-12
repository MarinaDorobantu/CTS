package ro.ase.cts.decorator;

public class ConcretDecorator extends DecoratorContactLess {

	public ConcretDecorator(ICard card) {
		super(card);
	}

	@Override
	public void platesteContactLess() {
		System.out.println(super.getCard().getDetinatorCard()+" plateste contactless.");
	}

}
