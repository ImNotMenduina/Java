package entities;

public class Professor extends Pessoa{
	private Turma turma ; 
	private Calculadora calc = new Calculadora(); 
	
	public Professor(String nome, char sexo, Integer idade, Integer turma) {
		super(nome, sexo, idade) ; 
		this.turma = new Turma(turma) ; 
	}
	
	public Double calcularMediaBimestre1(Aluno aluno) {
		calc.Soma(aluno.getNota1(), aluno.getNota2()) ; 
		Double mediaBimestre1 = calc.Divisao(calc.getResultadoReal(), 2.0) ; 
		return mediaBimestre1 ;
	}
	
	public Double calcularMediaBimestre2(Aluno aluno) {
		calc.Soma(aluno.getNota3(), aluno.getNota4()) ; 
		Double mediaBimestre2 = calc.Divisao(calc.getResultadoReal(), 2.0) ; 
		return mediaBimestre2 ; 
	}
	
	public Double calcularMediaFinal(Aluno aluno) {
		Double mediaFinal = calc.Soma(this.calcularMediaBimestre1(aluno), this.calcularMediaBimestre2(aluno)) ; 
		if(mediaFinal >= 6) {
			aluno.setAprovado(true) ;  
		}
		else {
			aluno.setAprovado(false);
		}
		return mediaFinal ;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Calculadora getCalc() {
		return calc;
	}

	public void setCalc(Calculadora calc) {
		this.calc = calc;
	}
	
}
