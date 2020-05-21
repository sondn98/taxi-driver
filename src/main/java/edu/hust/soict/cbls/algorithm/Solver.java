package edu.hust.soict.cbls.algorithm;

import edu.hust.soict.cbls.common.config.Const;
import edu.hust.soict.cbls.common.config.Properties;
import edu.hust.soict.cbls.data.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Solver {

    protected Input input;
    protected Properties props;

    private static final Logger logger = LoggerFactory.getLogger(Solver.class);

    public Solver(Properties props){
        this.props = props;
        this.input = Reader.read(props.getProperty(Const.INPUT_FILE_PATH));
    }

    public abstract Solution solve();

}
