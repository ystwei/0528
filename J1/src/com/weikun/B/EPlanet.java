package com.weikun.B;




public enum EPlanet {// public static final EPlanet mars=new EPlanet();
	
	MARS(){
		@Override
		public void mark(){
			System.out.println("����");
		}
		
	},JUPITER(){
		@Override
		public void mark(){
			System.out.println("ľ��");
		}
		
	},MERCURY(){
		@Override
		public void mark(){
			System.out.println("ˮ��");
		}
		
	};
	public abstract  void mark();
	public void ok(){
		switch (this) {
		case MARS:
			System.out.println("����");
			break;
		case JUPITER:
			System.out.println("ľ��");
			break;
		case MERCURY:
			System.out.println("ˮ��");
			break;
		default:
			break;
		}
		
	}

}
