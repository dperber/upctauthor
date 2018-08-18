/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalUpctformaParser;
import org.xtext.services.UpctformaGrammarAccess;

public class UpctformaParser extends AbstractContentAssistParser {

	@Inject
	private UpctformaGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUpctformaParser createParser() {
		InternalUpctformaParser result = new InternalUpctformaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getContentElementAccess().getAlternatives(), "rule__ContentElement__Alternatives");
					put(grammarAccess.getArgumentAccess().getAlternatives(), "rule__Argument__Alternatives");
					put(grammarAccess.getSimpleArgumentAccess().getAlternatives(), "rule__SimpleArgument__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getTypeSimpleElementAccess().getAlternatives(), "rule__TypeSimpleElement__Alternatives");
					put(grammarAccess.getContentDefinitionAccess().getGroup(), "rule__ContentDefinition__Group__0");
					put(grammarAccess.getContentDefinitionAccess().getGroup_4(), "rule__ContentDefinition__Group_4__0");
					put(grammarAccess.getContentDefinitionAccess().getGroup_5(), "rule__ContentDefinition__Group_5__0");
					put(grammarAccess.getContentDefinitionAccess().getGroup_5_1(), "rule__ContentDefinition__Group_5_1__0");
					put(grammarAccess.getContentDefinitionAccess().getGroup_6(), "rule__ContentDefinition__Group_6__0");
					put(grammarAccess.getContentDefinitionAccess().getGroup_6_3(), "rule__ContentDefinition__Group_6_3__0");
					put(grammarAccess.getContentDefinitionAccess().getGroup_7(), "rule__ContentDefinition__Group_7__0");
					put(grammarAccess.getContentDefinitionAccess().getGroup_7_3(), "rule__ContentDefinition__Group_7_3__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getTemplateDefAccess().getGroup(), "rule__TemplateDef__Group__0");
					put(grammarAccess.getTemplateDefAccess().getGroup_4(), "rule__TemplateDef__Group_4__0");
					put(grammarAccess.getTemplateDefAccess().getGroup_4_1(), "rule__TemplateDef__Group_4_1__0");
					put(grammarAccess.getUnitAccess().getGroup(), "rule__Unit__Group__0");
					put(grammarAccess.getUnitAccess().getGroup_5(), "rule__Unit__Group_5__0");
					put(grammarAccess.getType_ImplAccess().getGroup(), "rule__Type_Impl__Group__0");
					put(grammarAccess.getRowAccess().getGroup(), "rule__Row__Group__0");
					put(grammarAccess.getRowAccess().getGroup_3(), "rule__Row__Group_3__0");
					put(grammarAccess.getRowAccess().getGroup_3_1(), "rule__Row__Group_3_1__0");
					put(grammarAccess.getRowAccess().getGroup_4(), "rule__Row__Group_4__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getColumnAccess().getGroup_3(), "rule__Column__Group_3__0");
					put(grammarAccess.getColumnAccess().getGroup_4(), "rule__Column__Group_4__0");
					put(grammarAccess.getColumnAccess().getGroup_4_1(), "rule__Column__Group_4_1__0");
					put(grammarAccess.getUseTemplateAccess().getGroup(), "rule__UseTemplate__Group__0");
					put(grammarAccess.getUseTemplateAccess().getGroup_2(), "rule__UseTemplate__Group_2__0");
					put(grammarAccess.getUseTemplateAccess().getGroup_2_2(), "rule__UseTemplate__Group_2_2__0");
					put(grammarAccess.getContentElement_ImplAccess().getGroup(), "rule__ContentElement_Impl__Group__0");
					put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
					put(grammarAccess.getImageAccess().getGroup_3(), "rule__Image__Group_3__0");
					put(grammarAccess.getWidgetAccess().getGroup(), "rule__Widget__Group__0");
					put(grammarAccess.getWidgetAccess().getGroup_4(), "rule__Widget__Group_4__0");
					put(grammarAccess.getWidgetAccess().getGroup_4_2(), "rule__Widget__Group_4_2__0");
					put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
					put(grammarAccess.getTextAccess().getGroup_3(), "rule__Text__Group_3__0");
					put(grammarAccess.getComposite_ImplAccess().getGroup(), "rule__Composite_Impl__Group__0");
					put(grammarAccess.getVideoAccess().getGroup(), "rule__Video__Group__0");
					put(grammarAccess.getVideoAccess().getGroup_3(), "rule__Video__Group_3__0");
					put(grammarAccess.getSimpleArgument_ImplAccess().getGroup(), "rule__SimpleArgument_Impl__Group__0");
					put(grammarAccess.getParameter_ImplAccess().getGroup(), "rule__Parameter_Impl__Group__0");
					put(grammarAccess.getFixedAccess().getGroup(), "rule__Fixed__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getArgument_ImplAccess().getGroup(), "rule__Argument_Impl__Group__0");
					put(grammarAccess.getTabAccess().getGroup(), "rule__Tab__Group__0");
					put(grammarAccess.getTabAccess().getGroup_3(), "rule__Tab__Group_3__0");
					put(grammarAccess.getTabAccess().getGroup_3_1(), "rule__Tab__Group_3_1__0");
					put(grammarAccess.getAnimationAccess().getGroup(), "rule__Animation__Group__0");
					put(grammarAccess.getAnimationAccess().getGroup_3(), "rule__Animation__Group_3__0");
					put(grammarAccess.getAnimationAccess().getGroup_4(), "rule__Animation__Group_4__0");
					put(grammarAccess.getAnimationAccess().getGroup_5(), "rule__Animation__Group_5__0");
					put(grammarAccess.getAnimationAccess().getGroup_5_1(), "rule__Animation__Group_5_1__0");
					put(grammarAccess.getDragAndDropAccess().getGroup(), "rule__DragAndDrop__Group__0");
					put(grammarAccess.getDragAndDropAccess().getGroup_3(), "rule__DragAndDrop__Group_3__0");
					put(grammarAccess.getDragAndDropAccess().getGroup_3_1(), "rule__DragAndDrop__Group_3_1__0");
					put(grammarAccess.getCompositeArgument_ImplAccess().getGroup(), "rule__CompositeArgument_Impl__Group__0");
					put(grammarAccess.getCompositeArgument_ImplAccess().getGroup_3(), "rule__CompositeArgument_Impl__Group_3__0");
					put(grammarAccess.getCompositeArgument_ImplAccess().getGroup_3_3(), "rule__CompositeArgument_Impl__Group_3_3__0");
					put(grammarAccess.getParagraphAccess().getGroup(), "rule__Paragraph__Group__0");
					put(grammarAccess.getParagraphAccess().getGroup_1(), "rule__Paragraph__Group_1__0");
					put(grammarAccess.getSimpleTypeAccess().getGroup(), "rule__SimpleType__Group__0");
					put(grammarAccess.getAggregatedTypeAccess().getGroup(), "rule__AggregatedType__Group__0");
					put(grammarAccess.getAggregatedTypeAccess().getGroup_3(), "rule__AggregatedType__Group_3__0");
					put(grammarAccess.getAggregatedTypeAccess().getGroup_3_1(), "rule__AggregatedType__Group_3_1__0");
					put(grammarAccess.getWidgetTypeAccess().getGroup(), "rule__WidgetType__Group__0");
					put(grammarAccess.getWidgetTypeAccess().getGroup_4(), "rule__WidgetType__Group_4__0");
					put(grammarAccess.getWidgetTypeAccess().getGroup_4_1(), "rule__WidgetType__Group_4_1__0");
					put(grammarAccess.getListTypeAccess().getGroup(), "rule__ListType__Group__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_4(), "rule__Section__Group_4__0");
					put(grammarAccess.getSectionAccess().getGroup_5(), "rule__Section__Group_5__0");
					put(grammarAccess.getSectionAccess().getGroup_6(), "rule__Section__Group_6__0");
					put(grammarAccess.getSectionAccess().getGroup_6_1(), "rule__Section__Group_6_1__0");
					put(grammarAccess.getContentDefinitionAccess().getNameAssignment_2(), "rule__ContentDefinition__NameAssignment_2");
					put(grammarAccess.getContentDefinitionAccess().getNameAssignment_4_1(), "rule__ContentDefinition__NameAssignment_4_1");
					put(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_0(), "rule__ContentDefinition__ImportsAssignment_5_0");
					put(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_1_1(), "rule__ContentDefinition__ImportsAssignment_5_1_1");
					put(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_2(), "rule__ContentDefinition__TypesAssignment_6_2");
					put(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_3_1(), "rule__ContentDefinition__TypesAssignment_6_3_1");
					put(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_2(), "rule__ContentDefinition__TemplatesAssignment_7_2");
					put(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_3_1(), "rule__ContentDefinition__TemplatesAssignment_7_3_1");
					put(grammarAccess.getContentDefinitionAccess().getUnitAssignment_8(), "rule__ContentDefinition__UnitAssignment_8");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getTemplateDefAccess().getNameAssignment_2(), "rule__TemplateDef__NameAssignment_2");
					put(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_0(), "rule__TemplateDef__RowsAssignment_4_0");
					put(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_1_1(), "rule__TemplateDef__RowsAssignment_4_1_1");
					put(grammarAccess.getUnitAccess().getNameAssignment_1(), "rule__Unit__NameAssignment_1");
					put(grammarAccess.getUnitAccess().getAuthorAssignment_2(), "rule__Unit__AuthorAssignment_2");
					put(grammarAccess.getUnitAccess().getSectionsAssignment_4(), "rule__Unit__SectionsAssignment_4");
					put(grammarAccess.getUnitAccess().getSectionsAssignment_5_1(), "rule__Unit__SectionsAssignment_5_1");
					put(grammarAccess.getType_ImplAccess().getNameAssignment_2(), "rule__Type_Impl__NameAssignment_2");
					put(grammarAccess.getRowAccess().getColumnsAssignment_3_0(), "rule__Row__ColumnsAssignment_3_0");
					put(grammarAccess.getRowAccess().getColumnsAssignment_3_1_1(), "rule__Row__ColumnsAssignment_3_1_1");
					put(grammarAccess.getRowAccess().getUsetemplateAssignment_4_1(), "rule__Row__UsetemplateAssignment_4_1");
					put(grammarAccess.getColumnAccess().getWidthAssignment_3_1(), "rule__Column__WidthAssignment_3_1");
					put(grammarAccess.getColumnAccess().getElementsAssignment_4_0(), "rule__Column__ElementsAssignment_4_0");
					put(grammarAccess.getColumnAccess().getElementsAssignment_4_1_1(), "rule__Column__ElementsAssignment_4_1_1");
					put(grammarAccess.getUseTemplateAccess().getTypetemplateAssignment_1(), "rule__UseTemplate__TypetemplateAssignment_1");
					put(grammarAccess.getUseTemplateAccess().getArgumentsAssignment_2_1(), "rule__UseTemplate__ArgumentsAssignment_2_1");
					put(grammarAccess.getUseTemplateAccess().getArgumentsAssignment_2_2_1(), "rule__UseTemplate__ArgumentsAssignment_2_2_1");
					put(grammarAccess.getImageAccess().getUrlAssignment_3_1(), "rule__Image__UrlAssignment_3_1");
					put(grammarAccess.getWidgetAccess().getNameAssignment_1(), "rule__Widget__NameAssignment_1");
					put(grammarAccess.getWidgetAccess().getWidgettypeAssignment_3(), "rule__Widget__WidgettypeAssignment_3");
					put(grammarAccess.getWidgetAccess().getWidgetargumentsAssignment_4_1(), "rule__Widget__WidgetargumentsAssignment_4_1");
					put(grammarAccess.getWidgetAccess().getWidgetargumentsAssignment_4_2_1(), "rule__Widget__WidgetargumentsAssignment_4_2_1");
					put(grammarAccess.getTextAccess().getParagraphsAssignment_2(), "rule__Text__ParagraphsAssignment_2");
					put(grammarAccess.getTextAccess().getParagraphsAssignment_3_1(), "rule__Text__ParagraphsAssignment_3_1");
					put(grammarAccess.getVideoAccess().getUrlAssignment_3_1(), "rule__Video__UrlAssignment_3_1");
					put(grammarAccess.getFixedAccess().getTypeAssignment_2(), "rule__Fixed__TypeAssignment_2");
					put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
					put(grammarAccess.getTabAccess().getArgumentsAssignment_3_0(), "rule__Tab__ArgumentsAssignment_3_0");
					put(grammarAccess.getTabAccess().getArgumentsAssignment_3_1_1(), "rule__Tab__ArgumentsAssignment_3_1_1");
					put(grammarAccess.getAnimationAccess().getWidthAssignment_3_1(), "rule__Animation__WidthAssignment_3_1");
					put(grammarAccess.getAnimationAccess().getImageAssignment_4_1(), "rule__Animation__ImageAssignment_4_1");
					put(grammarAccess.getAnimationAccess().getArgumentsAssignment_5_0(), "rule__Animation__ArgumentsAssignment_5_0");
					put(grammarAccess.getAnimationAccess().getArgumentsAssignment_5_1_1(), "rule__Animation__ArgumentsAssignment_5_1_1");
					put(grammarAccess.getDragAndDropAccess().getArgumentsAssignment_3_0(), "rule__DragAndDrop__ArgumentsAssignment_3_0");
					put(grammarAccess.getDragAndDropAccess().getArgumentsAssignment_3_1_1(), "rule__DragAndDrop__ArgumentsAssignment_3_1_1");
					put(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsAssignment_3_2(), "rule__CompositeArgument_Impl__ArgumentsAssignment_3_2");
					put(grammarAccess.getCompositeArgument_ImplAccess().getArgumentsAssignment_3_3_1(), "rule__CompositeArgument_Impl__ArgumentsAssignment_3_3_1");
					put(grammarAccess.getParagraphAccess().getTextAssignment_1_1(), "rule__Paragraph__TextAssignment_1_1");
					put(grammarAccess.getSimpleTypeAccess().getNameAssignment_1(), "rule__SimpleType__NameAssignment_1");
					put(grammarAccess.getSimpleTypeAccess().getTypeAssignment_2(), "rule__SimpleType__TypeAssignment_2");
					put(grammarAccess.getAggregatedTypeAccess().getNameAssignment_1(), "rule__AggregatedType__NameAssignment_1");
					put(grammarAccess.getAggregatedTypeAccess().getTypeAssignment_3_0(), "rule__AggregatedType__TypeAssignment_3_0");
					put(grammarAccess.getAggregatedTypeAccess().getTypeAssignment_3_1_1(), "rule__AggregatedType__TypeAssignment_3_1_1");
					put(grammarAccess.getWidgetTypeAccess().getNameAssignment_2(), "rule__WidgetType__NameAssignment_2");
					put(grammarAccess.getWidgetTypeAccess().getParametersAssignment_4_0(), "rule__WidgetType__ParametersAssignment_4_0");
					put(grammarAccess.getWidgetTypeAccess().getParametersAssignment_4_1_1(), "rule__WidgetType__ParametersAssignment_4_1_1");
					put(grammarAccess.getListTypeAccess().getNameAssignment_2(), "rule__ListType__NameAssignment_2");
					put(grammarAccess.getListTypeAccess().getListtypeAssignment_3(), "rule__ListType__ListtypeAssignment_3");
					put(grammarAccess.getSectionAccess().getNameAssignment_2(), "rule__Section__NameAssignment_2");
					put(grammarAccess.getSectionAccess().getImageAssignment_4_1(), "rule__Section__ImageAssignment_4_1");
					put(grammarAccess.getSectionAccess().getTitleAssignment_5_1(), "rule__Section__TitleAssignment_5_1");
					put(grammarAccess.getSectionAccess().getRowsAssignment_6_0(), "rule__Section__RowsAssignment_6_0");
					put(grammarAccess.getSectionAccess().getRowsAssignment_6_1_1(), "rule__Section__RowsAssignment_6_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UpctformaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UpctformaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
