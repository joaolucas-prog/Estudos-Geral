package br.com.ingrao.jsf2.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.charts.ChartData;
import org.primefaces.model.charts.axes.cartesian.CartesianScales;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearAxes;
import org.primefaces.model.charts.axes.cartesian.linear.CartesianLinearTicks;
import org.primefaces.model.charts.bar.BarChartDataSet;
import org.primefaces.model.charts.bar.BarChartModel;
import org.primefaces.model.charts.bar.BarChartOptions;
import org.primefaces.model.charts.optionconfig.legend.Legend;
import org.primefaces.model.charts.optionconfig.legend.LegendLabel;
import org.primefaces.model.charts.optionconfig.title.Title;

import br.com.ingrao.jsf2.bean.Livro;
import br.com.ingrao.jsf2.bean.Venda;
import br.com.ingrao.jsf2.dao.ConnectionFactory;
import br.com.ingrao.jsf2.dao.LivroDAO;

@Named
@ViewScoped
public class VendaMB implements Serializable {
	private static final long serialVersionUID = 1424363801459910542L;

	public BarChartModel getBarChartModel() {
		BarChartModel barModel = new BarChartModel();
		ChartData data = new ChartData();

		BarChartDataSet barDataSet = new BarChartDataSet();
		barDataSet.setLabel("Vendas");

		List<Number> values = new ArrayList<>();
		List<Venda> vendas = getVendas();
		for (Venda venda : vendas) {
			values.add(venda.getQuantidade());
		}
		barDataSet.setData(values);
		barDataSet.setBackgroundColor("rgba(255,99,132,0.2)");
		barDataSet.setBorderColor("rgb(255, 99, 132)");
		barDataSet.setBorderWidth(1);

		data.addChartDataSet(barDataSet);

		List<String> labels = new ArrayList<>();
		for (Venda venda : vendas) {
			labels.add(venda.getLivro().getTitulo());
		}
		data.setLabels(labels);
		barModel.setData(data);

		// Options
		BarChartOptions options = new BarChartOptions();
		CartesianScales cScales = new CartesianScales();
		CartesianLinearAxes linearAxes = new CartesianLinearAxes();
		linearAxes.setOffset(true);
		CartesianLinearTicks ticks = new CartesianLinearTicks();
		ticks.setBeginAtZero(true);
		linearAxes.setTicks(ticks);
		cScales.addYAxesData(linearAxes);
		options.setScales(cScales);

		Title title = new Title();
		title.setDisplay(true);
		title.setText("Gráfico de Barra");
		options.setTitle(title);

		Legend legend = new Legend();
		legend.setDisplay(true);
		legend.setPosition("top");
		LegendLabel legendLabels = new LegendLabel();
		legendLabels.setFontStyle("bold");
		legendLabels.setFontColor("#2980B9");
		legendLabels.setFontSize(24);
		legend.setLabels(legendLabels);
		options.setLegend(legend);

		barModel.setOptions(options);
		return barModel;

	}

	public List<Venda> getVendas() {

		List<Venda> vendas = new ArrayList<>();
		List<Livro> livros = new LivroDAO(ConnectionFactory.getConecction()).findAll();

		Random random = new Random(1234);
		for (Livro livro : livros) {
			Integer quantidade = random.nextInt(500);
			vendas.add(new Venda(livro, quantidade));
		}
		return vendas;
	}

}
