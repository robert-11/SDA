package ro.unitbv.lab6maps;

public class info {
	private String nume, prenume;
	private double istorie;
	private double mate;

	public info(String nume, String prenume, double mate, double istorie) {
		this.nume = nume;
		this.prenume = prenume;
		this.mate= mate;
		this.istorie = istorie;

	}

		public void setNoterom(double istorie) {
			this.istorie = istorie;
		}

		public void setNotemate(double mate) {
			this.mate = mate;
		}
		@Override
		public String toString() {
			return "Nume:" + nume + ", Prenume: " + prenume + ", Nota istorie:[" + istorie + "] ,Nota mate:[" + mate + "]";
		}

		public String getNume() {
			return nume;
		}

		public String getPrenume() {
			return prenume;
		}

		public double getmate() {
			return mate;
		}

		public double getistorie() {
			return istorie;

		}
}
