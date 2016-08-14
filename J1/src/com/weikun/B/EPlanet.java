package com.weikun.B;




public enum EPlanet {// public static final EPlanet mars=new EPlanet();
	
	MARS(){
		@Override
		public void mark(){
			System.out.println("»ðÐÇ");
		}
		
	},JUPITER(){
		@Override
		public void mark(){
			System.out.println("Ä¾ÐÇ");
		}
		
	},MERCURY(){
		@Override
		public void mark(){
			System.out.println("Ë®ÐÇ");
		}
		
	};
	public abstract  void mark();
	public void ok(){
		switch (this) {
		case MARS:
			System.out.println("»ðÐÇ");
			break;
		case JUPITER:
			System.out.println("Ä¾ÐÇ");
			break;
		case MERCURY:
			System.out.println("Ë®ÐÇ");
			break;
		default:
			break;
		}
		
	}

}
