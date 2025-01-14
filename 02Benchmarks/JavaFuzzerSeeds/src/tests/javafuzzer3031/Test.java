package tests.javafuzzer3031;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:59:48 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-525023287181086605L;
    public int iFld=35174;
    public static boolean bFld=false;
    public static byte byFld=-100;
    public short sFld=27450;
    public float fFld=0.542F;
    public static float fArrFld[]=new float[N];
    public static int iArrFld1[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -55.120F);
        FuzzerUtils.init(Test.iArrFld1, 11);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i5, long l, int i6) {

        int i8=3, i9=1617, i10=-10495, i11=5, iArr1[]=new int[N];
        long l1=16704L;
        double d=-2.9792;
        short s1=-16061;
        boolean bArr[]=new boolean[N];

        FuzzerUtils.init(iArr1, 11956);
        FuzzerUtils.init(bArr, false);

        i6 >>= (int)l;
        for (int i7 : iArr1) {
            for (i8 = 1; i8 < 4; ++i8) {
                for (i10 = i8; i10 < 2; ++i10) {
                    bArr[i10] = Test.bFld;
                    if (Test.bFld) break;
                    if (Test.bFld) continue;
                    i6 = (int)Test.instanceCount;
                    if (Test.bFld) break;
                    l += (i10 * l1);
                    i5 = (int)l1;
                }
                d -= l1;
                Test.instanceCount = -6;
                s1 = (short)i6;
                Test.bFld = Test.bFld;
            }
        }
        long meth_res = i5 + l + i6 + i8 + i9 + i10 + i11 + l1 + Double.doubleToLongBits(d) + s1 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(bArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth1() {

        int i2=3, i3=7, i4=-128, i12=18, i13=1, i14=199, iArr[]=new int[N], iArr2[]=new int[N];
        double d1=0.14767;
        float f=-2.742F;

        FuzzerUtils.init(iArr, -13);
        FuzzerUtils.init(iArr2, 5);

        i2 = 210;
        while ((i2 -= 2) > 0) {
            for (i3 = 15; i3 > 1; i3--) {
                iArr[i3 + 1] = (int)(++Test.instanceCount);
                i4 *= (sMeth(i2, Test.instanceCount, i2) * 11554);
                i4 = i2;
                i4 -= i2;
                i4 >>= (int)Test.instanceCount;
                i4 -= i3;
                for (i12 = 1; i12 < 2; ++i12) {
                    i13 *= (int)d1;
                    switch ((i2 % 6) + 11) {
                    case 11:
                        switch ((i2 % 2) + 100) {
                        case 100:
                            i4 *= (int)f;
                            iArr = iArr2;
                            i13 = i13;
                            break;
                        case 101:
                            Test.byFld += (byte)i12;
                        }
                    case 12:
                        i4 += (i12 * i12);
                    case 13:
                        iArr = iArr2;
                        break;
                    case 14:
                        i4 *= Test.byFld;
                        break;
                    case 15:
                        i4 = i14;
                        break;
                    case 16:
                        iArr[i3] += i4;
                        break;
                    }
                }
            }
        }
        long meth_res = i2 + i3 + i4 + i12 + i13 + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) + i14 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i15=-8, i16=42912, i17=5, i18=6361, i19=-12, i20=10, i21=3, i22=55475;

        iFld = iMeth1();
        i15 = 149;
        do {
            for (i16 = i15; 21 > i16; i16++) {
                Test.fArrFld[i15 + 1] = i17;
            }
            for (i18 = 1; 21 > i18; ++i18) {
                for (i20 = i18; i20 < 2; i20++) {
                    i17 = i20;
                    if (Test.bFld) {
                        Test.instanceCount = 11L;
                    } else {
                        i17 += -47;
                        i21 *= (int)Test.instanceCount;
                        Test.instanceCount = i18;
                    }
                    Test.instanceCount = i22;
                    i17 += i20;
                    Test.instanceCount <<= Test.instanceCount;
                }
            }
        } while ((i15 -= 2) > 0);
        long meth_res = i15 + i16 + i17 + i18 + i19 + i20 + i21 + i22;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr3) {

        int i23=-6, i24=152, i25=-36886, i26=170, i27=9, i28=-55003, i29=22388, i30=234, i31=11;
        double d2=62.65535;
        byte byArr[]=new byte[N];
        long lArr1[]=new long[N];
        boolean bArr1[]=new boolean[N];

        FuzzerUtils.init(byArr, (byte)-30);
        FuzzerUtils.init(lArr1, 7263895590656301372L);
        FuzzerUtils.init(bArr1, true);

        iFld += Math.max(iFld++, (int)(Long.reverseBytes(Test.instanceCount) + (byArr[(iFld >>> 1) % N]++)));
        iFld += (63 + iMeth());
        sFld >>= (short)iFld;
        iFld = (int)Test.instanceCount;
        iFld -= -175;
        Test.instanceCount = iFld;
        Test.instanceCount = Test.instanceCount;
        if (Test.bFld) {
            Test.instanceCount -= iFld;
            iFld >>= (int)13L;
        } else {
            lArr1[(iFld >>> 1) % N] >>= iFld;
        }
        for (i23 = 3; i23 < 296; i23++) {
            for (i25 = i23; i25 < 86; i25++) {
                Test.instanceCount += (((i25 * fFld) + Test.byFld) - i25);
                i26 -= (int)Test.instanceCount;
                bArr1[i25] = Test.bFld;
                if (Test.bFld) {
                    lArr1[i25 + 1] = i23;
                    for (i27 = 1; i27 < 1; i27++) {
                        i29 -= i27;
                    }
                    iFld += (i25 * i25);
                } else if (true) {
                    Test.iArrFld1[i23 + 1] %= (int)(i27 | 1);
                    for (i30 = 1; i30 > 1; i30--) {
                        i28 -= i31;
                        Test.byFld &= (byte)sFld;
                        i28 *= i26;
                        sFld += (short)d2;
                        Test.instanceCount -= i30;
                    }
                    i26 += (((i25 * i30) + sFld) - i27);
                    iFld >>= iFld;
                } else {
                    Test.instanceCount += (2662951992942587315L + (i25 * i25));
                }
            }
        }


    }
    public static void main(String[] strArr2) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr2);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
