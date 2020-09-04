import { NativeModules } from 'react-native';

type DcallerType = {
  multiply(a: number, b: number): Promise<number>;
};

const { Dcaller } = NativeModules;

export default Dcaller as DcallerType;
