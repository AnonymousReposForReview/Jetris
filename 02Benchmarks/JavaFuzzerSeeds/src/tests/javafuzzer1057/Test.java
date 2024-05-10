package tests.javafuzzer1057;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 13:43:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=967867115L;
    public double dFld=50.72428;
    public static int iFld=55086;
    public static volatile short sFld=14991;
    public byte byFld=-13;
    public int iArrFld[]=new int[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, -79);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth() {

        byte by=119;
        int i3=-4;

        dFld -= (Math.abs(by + i3) - i3);
        vMeth_check_sum += by + i3;
    }

    public static void vMeth1(int i7, int i8) {

        int i9=-99, i10=-223;

        for (i9 = 121; 4 < i9; i9 -= 2) {
            Test.instanceCount >>>= 138;
        }
        i8 >>= i10;
        i7 *= 44760;
        vMeth1_check_sum += i7 + i8 + i9 + i10;
    }

    public static int iMeth1(int i6, long l1) {

        int i11=43093, i12=14, i13=-10, i14=12, i15=155, i16=-25987;
        boolean b=true;
        float f1=0.716F;

        vMeth1(i6, i6);
        for (i11 = 12; i11 < 211; i11++) {
            Test.iFld += (((i11 * i11) + Test.instanceCount) - i11);
            Test.iFld <<= i6;
            if (b) {
                i6 >>= Test.sFld;
            } else if (b) {
            } else {
                for (i13 = 1; 8 > i13; i13++) {
                    i14 += i14;
                    f1 += (((i13 * Test.instanceCount) + Test.sFld) - i6);
                    b = true;
                    for (i15 = 2; i15 > 1; i15--) {
                        Test.iFld *= i13;
                        i12 = (int)l1;
                        try {
                            Test.iArrFld1[i11 + 1] = (Test.iArrFld1[i15] % 8);
                            i12 = (i6 % -1414349904);
                            i14 = (Test.iArrFld1[i13] % -86);
                        } catch (ArithmeticException a_e) {}
                        Test.sFld >>= (short)16054;
                    }
                }
            }
        }
        long meth_res = i6 + l1 + i11 + i12 + (b ? 1 : 0) + i13 + i14 + Float.floatToIntBits(f1) + i15 + i16;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(int i1) {

        float f=-1.870F, fArr[]=new float[N];
        int i2=-4, i4=-2, i5=-11;
        long l=-1929731544L;

        FuzzerUtils.init(fArr, 0.1020F);

        iArrFld[(i1 >>> 1) % N] /= (int)(((long)(Test.instanceCount + ((i1 + 54184) + (f / -14)))) | 1);
        i2 = 140;
        while (--i2 > 0) {
            vMeth();
            i4 = 1;
            do {
                fArr[i2] = (float)(++dFld);
                for (l = 1; l < 1; ++l) {
                    byte by1=103;
                    switch (((i5 >>> 1) % 1) + 97) {
                    case 97:
                        i1 += ((i2 * i4) & i4);
                        i5 = (int)(((i4 - i4) >> (i4 - by1)) - Math.abs(Test.instanceCount));
                        switch (((i4 % 3) * 5) + 101) {
                        case 110:
                            switch ((i2 % 3) + 96) {
                            case 96:
                                iArrFld = (iArrFld = (iArrFld = iArrFld));
                                break;
                            case 97:
                                Test.instanceCount <<= (long)((i1++) + ((--i5) - (i1 + 99.75513)));
                                by1 += (byte)(((l * i2) + l) - i5);
                                break;
                            case 98:
                                vMeth();
                                break;
                            }
                            break;
                        case 113:
                            i5 += (int)(((l * i5) + i1) - i2);
                            break;
                        case 115:
                            i1 *= iMeth1(Test.iFld, l);
                            break;
                        }
                        break;
                    default:
                        i1 += (int)l;
                    }
                }
            } while (++i4 < 11);
        }
        long meth_res = i1 + Float.floatToIntBits(f) + i2 + i4 + l + i5 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=15066, i17=-55, i18=8, i19=-146, i20=-43614, i21=-27532, i22=-2, i23=39668, i24=121, i25=-13, i26=115,
            i27=2, iArr[]=new int[N];
        boolean b1=false;
        float f2=1.600F;
        long lArr[][]=new long[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, 3);
        FuzzerUtils.init(lArr, -10L);
        FuzzerUtils.init(dArr, 31.98000);

        iArr[(i >>> 1) % N] = iMeth(Test.iFld);
        b1 = b1;
        for (i17 = 11; 226 > i17; i17++) {
            f2 += i;
            for (i19 = 5; i19 < 117; i19++) {
                for (i21 = 1; i21 < 2; i21++) {
                    Test.instanceCount += i18;
                }
                iArrFld[i17] = (int)Test.instanceCount;
                Test.instanceCount *= i21;
                i22 += (i19 - byFld);
                i20 = i21;
                i20 -= (int)Test.instanceCount;
            }
            lArr[i17][i17 + 1] += Test.iFld;
            i20 = i22;
            iArrFld[i17 + 1] *= (int)Test.instanceCount;
            try {
                i = (i19 / i17);
                i18 = (iArrFld[i17 + 1] / Test.iFld);
                i20 = (-19447 % iArr[i17]);
            } catch (ArithmeticException a_e) {}
            dArr[i17 + 1] = -101.725F;
            for (i23 = i17; i23 < 117; i23++) {
                Test.iArrFld1[i23] += i19;
                f2 += i19;
                i22 += i17;
                i25 = 1;
                do {
                    dFld += 2966919298L;
                    f2 = i24;
                    i20 += (int)f2;
                } while (++i25 < 1);
            }
            if (b1) continue;
        }
        for (i26 = 8; i26 < 160; i26 += 2) {
            i22 += (int)Test.instanceCount;
            Test.instanceCount += i26;
            Test.instanceCount *= (long)f2;
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
