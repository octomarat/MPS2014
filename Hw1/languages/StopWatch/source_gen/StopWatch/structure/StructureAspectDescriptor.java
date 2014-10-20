package StopWatch.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("StopWatch.structure.AnalogDisplay").super_("StopWatch.structure.Display").parents("StopWatch.structure.Display").properties("clockFaceNumerals").children(new String[]{"color"}, new boolean[]{false}).create();
      case 1:
        return new ConceptDescriptorBuilder("StopWatch.structure.Button").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("name", "size").children(new String[]{"color"}, new boolean[]{false}).create();
      case 2:
        return new ConceptDescriptorBuilder("StopWatch.structure.ColorRef").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("color").create();
      case 3:
        return new ConceptDescriptorBuilder("StopWatch.structure.ControlPanel").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("position").abstract_().create();
      case 4:
        return new ConceptDescriptorBuilder("StopWatch.structure.DigitalDisplay").super_("StopWatch.structure.Display").parents("StopWatch.structure.Display").children(new String[]{"onOffButton", "highlighting"}, new boolean[]{false, false}).create();
      case 5:
        return new ConceptDescriptorBuilder("StopWatch.structure.Display").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("precision").abstract_().alias("watch_display", "").create();
      case 6:
        return new ConceptDescriptorBuilder("StopWatch.structure.Highlighting").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").children(new String[]{"onOffButton", "color"}, new boolean[]{false, false}).create();
      case 7:
        return new ConceptDescriptorBuilder("StopWatch.structure.SeparateControl").super_("StopWatch.structure.ControlPanel").parents("StopWatch.structure.ControlPanel").children(new String[]{"startButton", "stopButton", "resetButton"}, new boolean[]{false, false, false}).create();
      case 8:
        return new ConceptDescriptorBuilder("StopWatch.structure.StopWatch").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").properties("shape", "caseType", "hasSpeaker").children(new String[]{"controlPanel", "display"}, new boolean[]{false, false}).alias("stop_watch", "").create();
      case 9:
        return new ConceptDescriptorBuilder("StopWatch.structure.UniversalControl").super_("StopWatch.structure.ControlPanel").parents("StopWatch.structure.ControlPanel").children(new String[]{"universalButton"}, new boolean[]{false}).create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"StopWatch.structure.AnalogDisplay", "StopWatch.structure.Button", "StopWatch.structure.ColorRef", "StopWatch.structure.ControlPanel", "StopWatch.structure.DigitalDisplay", "StopWatch.structure.Display", "StopWatch.structure.Highlighting", "StopWatch.structure.SeparateControl", "StopWatch.structure.StopWatch", "StopWatch.structure.UniversalControl"};
}
