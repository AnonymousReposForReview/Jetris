package tests.javafuzzer625;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:46:15 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-48275L;
    public static byte byFld=81;
    public static double dFld=22.63525;
    public int iFld=-24;
    public float fFld=-2.814F;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i1=-52345, i2=-29, i3=-64584, i4=99, iArr[]=new int[N];
        byte by=97;
        float f=-31.582F, fArr[]=new float[N];

        FuzzerUtils.init(iArr, 115);
        FuzzerUtils.init(fArr, -53.618F);

        for (i1 = 10; i1 < 321; i1++) {
            try {
                iArr[i1 - 1] = (i1 / 1748439666);
                i2 = (-40708 / i1);
                i2 = (i1 % i2);
            } catch (ArithmeticException a_e) {}
            by += (byte)i1;
            Test.instanceCount += i1;
            Test.instanceCount = (long)f;
            i2 -= -6;
            fArr[i1 - 1] = f;
            i2 *= i1;
            i2 += (int)Test.instanceCount;
            i2 += (((i1 * i1) + i1) - i2);
        }
        for (i3 = 2; i3 < 242; ++i3) {
            iArr[i3 - 1] = by;
            f *= i4;
        }
        i4 += (int)Test.instanceCount;
        i2 = i3;
        long meth_res = i1 + i2 + by + Float.floatToIntBits(f) + i3 + i4 + FuzzerUtils.checkSum(iArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(boolean b) {

        int i5=32112, i6=2, i7=-36259, i8=-63271, i9=57, i10=48431, i11=16630, iArr1[]=new int[N];
        float f1=0.604F;
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, -192);
        FuzzerUtils.init(byArr, (byte)11);

        Test.instanceCount *= iMeth1();
        iArr1[(i5 >>> 1) % N] += Test.byFld;
        iArr1[(i5 >>> 1) % N] = i5;
        Test.instanceCount *= (long)-12.60804;
        iArr1[(129 >>> 1) % N] = i5;
        i5 += (int)-33016L;
        for (i6 = 21; i6 < 379; i6++) {
            for (i8 = 1; 5 > i8; ++i8) {
                for (i10 = 1; i10 < 2; i10++) {
                    Test.byFld -= (byte)Test.instanceCount;
                    f1 /= (i9 | 1);
                    i7 *= i7;
                    byArr[i10] = (byte)i7;
                    iArr1[i8] += (int)f1;
                    Test.instanceCount += Test.instanceCount;
                }
            }
        }
        long meth_res = (b ? 1 : 0) + i5 + i6 + i7 + i8 + i9 + i10 + i11 + Float.floatToIntBits(f1) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(byArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i) {

        boolean b1=false;

        i = iMeth(b1);
        Test.dFld += i;
        i = i;
        vMeth_check_sum += i + (b1 ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        short s=23105;
        int i12=-23232, i13=1, i14=18, i15=110, i16=6, i17=14, i18=-131, i19=13, iArr2[]=new int[N];
        long l=-1457487584L;
        boolean b2=true;

        FuzzerUtils.init(iArr2, 170);

        vMeth(iFld);
        iArr2[(iFld >>> 1) % N] += (int)Test.instanceCount;
        s = (short)iFld;
        i12 = 1;
        do {
            for (i13 = 6; i13 < 119; ++i13) {
                switch ((i13 % 6) + 108) {
                case 108:
                    iFld >>>= i14;
                    fFld += Test.instanceCount;
                    for (i15 = 2; i15 > 1; i15 -= 3) {
                        iFld = i16;
                        iFld += (i15 | i14);
                        i14 -= (int)Test.instanceCount;
                        iArr2[i12 - 1] = (int)Test.instanceCount;
                        Test.dFld = i16;
                        if (true) break;
                    }
                case 109:
                case 110:
                    for (l = 1; 2 > l; ++l) {
                        iFld = -47285;
                        i14 += (int)l;
                        if (b2) continue;
                    }
                    i17 += (i13 - fFld);
                    Test.byFld = Test.byFld;
                    b2 = b2;
                    break;
                case 111:
                    iFld -= i12;
                    break;
                case 112:
                    try {
                        i17 = (19443 / i14);
                        iArr2[i12 + 1] = (i14 % 45305);
                        i17 = (-52400 % i12);
                    } catch (ArithmeticException a_e) {}
                    for (i18 = 1; i18 < 2; ++i18) {
                        fFld += i18;
                        Test.instanceCount += (((i18 * i17) + fFld) - i13);
                        i19 = (int)Test.instanceCount;
                        s += (short)(i18 ^ (long)fFld);
                        i14 = (int)Test.instanceCount;
                    }
                    break;
                case 113:
                    i19 -= i17;
                    break;
                default:
                    b2 = b2;
                }
            }
        } while (++i12 < 211);



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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
