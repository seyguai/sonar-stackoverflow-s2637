public interface IService {
    boolean isValid();

    Object transformBloc(Bloc bloc);

    boolean testBloc(Bloc bloc);

    boolean testModel(BlocModel blocModel);
}
