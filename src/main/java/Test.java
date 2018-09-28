import java.util.List;

public final class Test {

    protected final boolean foo(List<BlocModel> modelList, IService service) {
        boolean result = true;
        for (final BlocModel model : modelList) {
            if (false == model.getStatus().isAlpha() && model.getStatus().isBeta() && service.isValid()) {
                if (model.getBloc().getType() == Type.ALPHA) {
                    result &= service.transformBloc(model.getBloc()) != null;
                } else {
                    result &= false;
                }
            } else {
                result &= (model.getStatus().isAlpha());
            }
            result &= false == service.testBloc(model.getBloc());
            result &= false == model.getBloc().getStatus().equals(Status.GAMMA);
            if (false == result) {
                break;
            }
        }
        return result;
    }

}
