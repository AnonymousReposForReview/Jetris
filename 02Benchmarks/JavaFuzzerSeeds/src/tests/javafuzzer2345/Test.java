package tests.javafuzzer2345;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 13:04:06 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-537774059505128505L;
    public static short sFld=2737;
    public byte byFld=50;
    public static long lArrFld[][]=new long[N][N];
    public int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 1344L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i6, float f1) {

        int i7=-36, i8=-1477, i9=-12081, i10=88, iArr1[]=new int[N];
        double d=-2.109348;
        boolean b=true;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -31582);
        FuzzerUtils.init(lArr, 132L);

        for (i7 = 6; i7 < 359; i7++) {
            i8 -= -77;
            iArr1 = iArr1;
            i8 -= (int)f1;
            Test.instanceCount = 3745;
        }
        i8 = Test.sFld;
        d -= i6;
        for (long l : lArr) {
            if (b) {
                for (i9 = 1; i9 < 4; i9++) {
                    if (false) break;
                    i10 *= i6;
                }
                Test.instanceCount -= i8;
            } else if (b) {
                d = Test.instanceCount;
            } else {
                iArr1[(-240 >>> 1) % N] = i9;
            }
        }
        vMeth2_check_sum += i6 + Float.floatToIntBits(f1) + i7 + i8 + Double.doubleToLongBits(d) + i9 + i10 + (b ? 1 :
            0) + FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth1(float f) {

        int i11=14;

        vMeth2(-189, f);
        Test.lArrFld[(i11 >>> 1) % N][(i11 >>> 1) % N] -= 17356;
        i11 >>= 125;
        i11 = (int)Test.instanceCount;
        vMeth1_check_sum += Float.floatToIntBits(f) + i11;
    }

    public static void vMeth(int i1, int i2, int i3) {

        int i4=1, i5=20778, i12=4, i13=46417, i14=8089, i15=64679, iArr[]=new int[N];
        float f2=-1.840F, fArr[]=new float[N];
        double d1=0.111547;

        FuzzerUtils.init(iArr, 50146);
        FuzzerUtils.init(fArr, 71.926F);

        for (i4 = 180; 9 < i4; --i4) {
            iArr[i4] |= i5;
            vMeth1(f2);
        }
        Test.lArrFld[(i1 >>> 1) % N][(-27116 >>> 1) % N] *= (long)5.1782;
        for (float f3 : fArr) {
            for (i12 = 1; i12 < 4; i12++) {
                Test.sFld += (short)(-18984 + (i12 * i12));
                i14 = 2;
                do {
                    i1 = i15;
                    i3 -= (int)d1;
                    i13 += (i14 * i14);
                    iArr[i14 - 1] >>= i2;
                    i2 <<= (int)Test.instanceCount;
                    i2 += -14;
                    i15 |= 161;
                } while ((i14 -= 3) > 0);
            }
        }
        vMeth_check_sum += i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f2) + i12 + i13 + i14 + i15 +
            Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-310, i16=-3, i17=-3, i18=36389, i19=62, i20=-6, i21=184, i22=49805, i23=-14;
        float f4=0.76F, fArr1[]=new float[N];
        double d2=2.67979, dArr[]=new double[N];
        byte byArr[]=new byte[N];
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(byArr, (byte)-54);
        FuzzerUtils.init(bArr, false);
        FuzzerUtils.init(fArr1, 68.156F);
        FuzzerUtils.init(dArr, 0.39938);

        i = 1;
        do {
            boolean b1=false;
            vMeth(33, i, i);
            if (b1) break;
            f4 -= i;
            i16 += i;
            Test.instanceCount *= i;
            byArr[i] <<= (byte)i16;
            byFld += (byte)Test.instanceCount;
            bArr[i] = b1;
            for (i17 = 3; i17 < 72; i17++) {
                if (b1) continue;
                i18 = i;
                Test.instanceCount += i17;
                i16 -= (int)f4;
            }
            Test.lArrFld[i - 1][i + 1] = Test.instanceCount;
        } while (++i < 351);
        i19 = 1;
        while (++i19 < 353) {
            for (i20 = 4; i20 < 71; i20++) {
                switch ((((i17 >>> 1) % 5) * 5) + 52) {
                case 77:
                    for (d2 = 1; d2 < 2; ++d2) {
                        i22 *= (int)Test.instanceCount;
                        byFld = (byte)i16;
                        i18 = i16;
                        try {
                            i22 = (i22 / 175);
                            i21 = (-698064765 % iArrFld[(int)(d2 - 1)]);
                            i21 = (189 / i17);
                        } catch (ArithmeticException a_e) {}
                    }
                    Test.instanceCount += (i20 * i20);
                    switch ((i20 % 2) + 90) {
                    case 90:
                        i23 = 1;
                        while (++i23 < 2) {
                            i22 -= (int)d2;
                            f4 = Test.instanceCount;
                        }
                        i16 -= i;
                        i22 |= i19;
                        break;
                    case 91:
                        i16 = i19;
                        break;
                    default:
                        fArr1[i19] -= -86.201F;
                    }
                    break;
                case 53:
                    fArr1[i19 - 1] = i19;
                    break;
                case 58:
                    dArr[i19] %= (i23 | 1);
                    break;
                case 70:
                    Test.lArrFld[i19 - 1][i20 - 1] -= 49619;
                    break;
                case 62:
                    Test.lArrFld[i19] = FuzzerUtils.long1array(N, (long)-3830705646L);
                    break;
                }
            }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}