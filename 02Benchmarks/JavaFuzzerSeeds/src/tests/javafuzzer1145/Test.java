package tests.javafuzzer1145;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 15:48:31 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-929240604342381981L;
    public static int iFld=0;
    public static double dFld=9.4197;
    public static byte byFld=80;
    public static short sFld=-26185;
    public boolean bFld=true;

    public static long vSmallMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static float fMeth(long l, int i) {


        Test.iFld = (int)l;
        long meth_res = l + i;
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vSmallMeth() {

        byte by=-70;

        Test.instanceCount = (long)((-Integer.reverseBytes(Test.iFld)) + fMeth((long)(by * Test.dFld), Test.iFld));
        vSmallMeth_check_sum += by;
    }

    public static void vMeth2() {

        int i4=0, i5=-29774, i6=-25422, i7=-12, iArr1[]=new int[N];
        boolean b=false;
        short s=-25074;
        float f=-17.681F, fArr[]=new float[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, -12);
        FuzzerUtils.init(lArr, -13L);
        FuzzerUtils.init(fArr, -2.891F);

        for (i4 = 7; i4 < 139; ++i4) {
            i6 = 1;
            while ((i6 += 2) < 12) {
                Test.iFld -= (int)Test.instanceCount;
            }
            if (b) {
                Test.instanceCount >>>= i5;
            }
            if (true) break;
            i7 = 1;
            do {
                Test.iFld = i4;
                iArr1[i4 + 1] -= (int)2.203F;
                i5 -= s;
            } while (++i7 < 12);
            Test.byFld = (byte)Test.instanceCount;
            switch ((i4 % 8) + 95) {
            case 95:
                iArr1[i4] = (int)Test.instanceCount;
                f -= Test.iFld;
                s = (short)Test.instanceCount;
            case 96:
                Test.instanceCount = i6;
                break;
            case 97:
                Test.dFld += i4;
                break;
            case 98:
                iArr1[i4 + 1] -= (int)3574808770723928794L;
                break;
            case 99:
                i5 = 6;
            case 100:
                i5 += (int)f;
                break;
            case 101:
                Test.iFld += i4;
                break;
            case 102:
                fArr[i4] -= i5;
                break;
            }
        }
        vMeth2_check_sum += i4 + i5 + i6 + (b ? 1 : 0) + i7 + s + Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr1)
            + FuzzerUtils.checkSum(lArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1() {

        int i10=-7, i11=-28798, i12=10, iArr2[]=new int[N];
        short s1=29757;
        float f1=31.484F, fArr1[]=new float[N];

        FuzzerUtils.init(iArr2, 3);
        FuzzerUtils.init(fArr1, -16.460F);

        vMeth2();
        for (int i9 : iArr2) {
            i10 = 1;
            while (++i10 < 4) {
                i9 += (((i10 * Test.instanceCount) + Test.instanceCount) - i10);
                for (i11 = 1; i11 < 1; i11 += 2) {
                    i12 -= 12606;
                    i12 -= s1;
                    i12 <<= (int)-4L;
                    i12 += (int)f1;
                    Test.instanceCount >>= i11;
                    i12 += i9;
                    i12 = (int)Test.instanceCount;
                    fArr1[i11 + 1] += i9;
                }
                Test.iFld = -55754;
                Test.iFld += (((i10 * i9) + i10) - s1);
            }
        }
        vMeth1_check_sum += i10 + i11 + i12 + s1 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void vMeth(int i3) {

        int i13=-69, i14=9, i15=27360, i16=-190, i17=-95, i18=146, i19=-214, iArr3[]=new int[N];
        float f2=98.122F;
        long l2=163L;
        boolean b1=false;

        FuzzerUtils.init(iArr3, -92);

        vMeth1();
        for (i13 = 1; i13 < 131; ++i13) {
            Test.sFld += (short)Test.iFld;
            i14 = (int)f2;
            for (i15 = 1; i15 < 12; ++i15) {
                Test.instanceCount -= i16;
                Test.iFld += (int)1.63075;
                for (l2 = 1; l2 < 2; l2++) {
                    i14 <<= Test.iFld;
                    i17 |= Test.iFld;
                    Test.iFld = i17;
                }
                iArr3[i13 - 1] = Test.sFld;
                for (i18 = 2; i18 > i15; --i18) {
                    i17 = (int)Test.instanceCount;
                    b1 = b1;
                }
            }
        }
        vMeth_check_sum += i3 + i13 + i14 + Float.floatToIntBits(f2) + i15 + i16 + l2 + i17 + i18 + i19 + (b1 ? 1 : 0)
            + FuzzerUtils.checkSum(iArr3);
    }

    public void mainTest(String[] strArr1) {

        int i1=64795, i2=36498, i20=-60804, i21=64530, i22=158, i23=-210, i24=-74, i25=0, iArr[]=new int[N];
        byte by1=108;
        float f3=1.647F, f4=0.557F, fArr2[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(iArr, -3);
        FuzzerUtils.init(fArr2, 0.771F);
        FuzzerUtils.init(dArr, 92.99749);

        for (int smallinvoc=0; smallinvoc<120; smallinvoc++) vSmallMeth();
        vSmallMeth();
        for (i1 = 8; i1 < 216; i1++) {
            Test.instanceCount ^= (Test.instanceCount++);
            by1 = (byte)(iArr[i1 - 1]++);
        }
        vSmallMeth();
        vMeth(i1);
        Test.sFld += (short)18976;
        f3 -= Test.instanceCount;
        Test.iFld = (int)Test.instanceCount;
        for (i20 = 128; i20 > 8; i20--) {
            i21 = (int)Test.dFld;
            i2 = i20;
            Test.iFld *= Test.iFld;
            i2 = (int)Test.instanceCount;
            i22 = 1;
            while (++i22 < 209) {
                for (i23 = 1; i23 < 1; i23++) {
                    iArr[i22 + 1] -= -3464;
                    i2 += Test.iFld;
                    i21 *= i1;
                    i21 += -185;
                    if (bFld) break;
                }
                Test.instanceCount += (i22 - Test.instanceCount);
                for (f4 = 1; f4 < 1; f4++) {
                    Test.instanceCount += (long)f4;
                    Test.iFld += (int)f4;
                    fArr2 = fArr2;
                    dArr[i20 - 1] = f3;
                    try {
                        i21 = (Test.iFld % i1);
                        iArr[i20 - 1] = (iArr[i22] / 53027);
                        Test.iFld = (i21 % 19865);
                    } catch (ArithmeticException a_e) {}
                    Test.instanceCount += (long)f3;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  fMeth ->  fMeth vSmallMeth mainTest Test
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
